# springconsul
Request URI for independent services.
1) Student service : http://localhost:9001/getport
2) School Service: http://localhost:9010/getstudentserviceport
3) Gateway Service: http://localhost:8061/school-service/getstudentserviceport

Points:
1) We can start consul by issuing the following command from the root path: consul agent -dev.
2) We can access consul using http://localhost:8500
2)  Use @Enablediscoveryclient annotation, so that the module is discoverable.
3) Add below bean definition in the gateway to enable automatical detection of the registered (in consul) applications.
      @Bean
        @ConditionalOnBean(DiscoveryClient.class)
        @ConditionalOnProperty(name = "spring.cloud.gateway.discovery.locator.enabled")	
        public DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(DiscoveryClient discoveryClient, DiscoveryLocatorProperties properties) {
          return new DiscoveryClientRouteDefinitionLocator(discoveryClient, properties);
        }
