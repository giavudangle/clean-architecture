package com.clean.architecture.infrastructure.http;

import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MainController {

  @GetMapping("/")
  public Map<String, Object> main() {
    Map<String, Object> main = new HashMap<>();

    main.put("application", "clean-architecture");
    main.put("status", "available");
    main.put("version", "1.0.0");

    return main;
  }
}
