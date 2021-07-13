package fr.ippon.thales;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/virtual/machine")
public class ForwardController {

    public static final String URL = "https://prices.azure.com/api/retail/prices?$filter=serviceName eq 'Virtual Machines'";

    @GetMapping("/")
    public VirtualMachineContainerDTO find(@RequestParam(required = false) Integer skip) {
        RestTemplate restTemplate = new RestTemplate();
        VirtualMachineContainerDTO dto = restTemplate
                .getForObject(url(skip), VirtualMachineContainerDTO.class);
        return dto;
    }

    private String url(Integer skip) {
        if(skip != null) {
            return URL + "&$skip=" + skip;
        }
        return URL;
    }

}
