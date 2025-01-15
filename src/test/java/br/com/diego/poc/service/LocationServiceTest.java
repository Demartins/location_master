package br.com.diego.poc.service;

import br.com.diego.poc.entity.Location;
import br.com.diego.poc.repository.LocationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LocationServiceTest {

        @Mock
        private LocationRepository locationRepository;

        @InjectMocks
        private LocationService locationService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void testSaveLocation() {
            Location location = new Location();
            when(locationRepository.save(location)).thenReturn(location);

            Location result = locationService.saveLocation(location);

            assertNotNull(result);
            assertEquals(location, result);
            verify(locationRepository, times(1)).save(location);
        }
}

