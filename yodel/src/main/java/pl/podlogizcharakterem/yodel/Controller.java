package pl.podlogizcharakterem.yodel;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/rzad")
    public String calculateRow(Model model) {

        model.addAttribute("calc", new Calculator());
        return "rowCalculator";
    }
    @PostMapping("/rzad")
    public String calculationsRow(@ModelAttribute("calc") Calculator calc) {
        calc.calculateFrenchRow();
        return "rowCalculations";
    }

    @GetMapping("/bok")
    public String calculateSide(Model model) {
        model.addAttribute("calc", new Calculator());
        return "sideCalculator";
    }

    @PostMapping("/bok")
    public String calculations(@ModelAttribute("calc") Calculator calc) {
        calc.calculateSide();
        return "sideCalculations";
    }
}
