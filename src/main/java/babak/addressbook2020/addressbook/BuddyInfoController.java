package babak.addressbook2020.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BuddyInfoController {

    @Autowired
    BuddyInfoRepository bir;

    @GetMapping("/welcome")
    public String welcome(Model model) {

        List<BuddyInfo> buddies = (List<BuddyInfo>) bir.findAll();
        model.addAttribute("buddies", buddies);

        return "buddies";
    }
}
