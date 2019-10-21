package fr.parisnanterre.miage.procs.sam.server;

import java.util.Map;
import java.util.HashMap;

import spark.ResponseTransformer;
import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;

class HTMLTransformer implements ResponseTransformer {
  private VelocityTemplateEngine engine;
  private String key;
  private String view;

  HTMLTransformer(String key, String view) {
      engine = new VelocityTemplateEngine();
  }

  @Override
  public String render(Object model) {
      Map<String, Object> map = new HashMap<>();
      map.put(key,model);
      return engine.render(new ModelAndView(map, view));
  }
}

