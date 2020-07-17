package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String skillsTracker() {
    return "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                    "</ol>" +
                "</body>" +
            "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                    "<body>" +
                        "<form action='' method='post'>" +
                            "<div><label for='text-name'>Name:</label></div>" +
                            "<input type='text' name='name' id='text-name' placeholder='Enter Name'/>" +
                            "<div><label for='first-choice'>My favorite language:</label></div>" +
                            "<select name='language1' id='first-choice'>" +
                                "<option value='' disabled selected hidden>Select language</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<div><label for='second-choice'>My second favorite language:</label></div>" +
                            "<select name='language2' id='second-choice'>" +
                                "<option value='' disabled selected hidden>Select language</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<div><label for='third-choice'>My third favorite language:</label></div>" +
                            "<select name='language3' id='third-choice'>" +
                                "<option value='' disabled selected hidden>Select language</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "<div><input type='submit' value='Submit'/></div>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String formInformation(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name +"</h1>" +
                        "<ol>" +
                            "<li>" + language1 +"</li>" +
                            "<li>" + language2 +"</li>" +
                            "<li>" + language3 +"</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

}