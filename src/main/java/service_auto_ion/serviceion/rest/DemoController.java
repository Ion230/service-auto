package service_auto_ion.serviceion.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service_auto_ion.serviceion.common.Mecanicul;

@Controller // Schimbat din @RestController în @Controller
public class DemoController {

    private Mecanicul dieselMecanic;
    private Mecanicul benzinMecanic;

    // Constructor
    public DemoController(@Qualifier("benzinMecanic") Mecanicul benzinMecanic,
                          @Qualifier("dieselMecanic") Mecanicul dieselMecanic) {
        this.benzinMecanic = benzinMecanic;
        this.dieselMecanic = dieselMecanic;
    }

    @GetMapping("/reparare")
    public ModelAndView reparaMasina(@RequestParam String tipMecanic) {
        System.out.println("Masina a fost adusa la auto service...");

        if ("diesel".equalsIgnoreCase(tipMecanic)) {
            dieselMecanic.reparaMasina();
            return new ModelAndView("diesel");
        } else if ("benzin".equalsIgnoreCase(tipMecanic)) {
            benzinMecanic.reparaMasina();
            return new ModelAndView("benzina");
        } else {
            return new ModelAndView("error");
        }
    }
}
