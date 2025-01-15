FROM node:14

WORKDIR /usr/src/app

# Clear npm cache
RUN npm cache clean --force

# Install edgemicro
RUN npm install -g edgemicro@3.3.1

# Ensure the directory exists before copying the file
RUN mkdir -p /root/.edgemicro

# Set environment variables
ENV EDGEMICRO_ORG=location-org
ENV EDGEMICRO_ENV=dev

# Copy the configuration file to the expected location
COPY config.yaml /root/.edgemicro/location-org-dev-config.yaml

EXPOSE 8000
CMD ["edgemicro", "start", "-o", "location-org", "-e", "dev", "-k", "$EDGEMICRO_KEY", "-s", "$EDGEMICRO_SECRET"]