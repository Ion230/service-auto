package service_auto_ion.serviceion.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service_auto_ion.serviceion.common.BenzinMecanic;
import service_auto_ion.serviceion.common.DieselMecanic;
import service_auto_ion.serviceion.common.Mecanicul;

@Configuration
public class ServiceConfig {

    @Bean
    public Mecanicul dieselMecanic() {
        return new DieselMecanic();
    }
    @Bean
    public Mecanicul benzinMecanic(){
        return new BenzinMecanic();
    }
}
