package com.Muj.Muj.Controllers;

import com.Muj.Muj.Entities.Disaster;
import com.Muj.Muj.Repo.DisasterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class DisasterController {

    private DisasterRepository disasterRepository;

    public DisasterController(DisasterRepository disasterRepository) {
        this.disasterRepository = disasterRepository;
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("getAll")
    public List<Disaster> getDisasters() {
        return disasterRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("add")
    public void addDisaster(@RequestBody Disaster disaster) {
        disasterRepository.save(disaster);
    }


}
