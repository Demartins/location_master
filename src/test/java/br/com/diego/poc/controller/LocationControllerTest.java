package br.com.diego.poc.controller;

import br.com.diego.poc.entity.Location;
import br.com.diego.poc.events.Producer;
import br.com.diego.poc.service.LocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class LocationControllerTest {

    private MockMvc mockMvc;

    @Mock
    private Producer producer;

    @Mock
    private LocationService locationService;

    @InjectMocks
    private LocationController locationController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(locationController).build();
    }

    @Test
    void testHello() throws Exception {
        mockMvc.perform(get("/location-master/kafka/testName"))
                .andExpect(status().isOk());

        verify(producer).sendMessage("hello, testName");
    }
    @Test
    void testSaveLocation() throws Exception {
        Location location = new Location();
        location.setId(1L);
        location.setName("Test Location");
        location.setLocationId("123");
        location.setStatus("Active");
        location.setBdaType("TypeA");

        when(locationService.saveLocation(any(Location.class))).thenReturn(location);

        mockMvc.perform(post("/location-master/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"Test Location\",\"locationId\":\"123\",\"status\":\"Active\",\"bdaType\":\"TypeA\"}"))
                .andExpect(status().isOk());

        verify(producer).sendMessage("send message locationLocation{id=1, name='Test Location', locationId='123', status='Active', bdaType='TypeA'}");
        verify(locationService).saveLocation(any(Location.class));
    }

}