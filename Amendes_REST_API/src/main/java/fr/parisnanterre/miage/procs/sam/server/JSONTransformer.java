package fr.parisnanterre.miage.procs.sam.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import spark.ResponseTransformer;

class JSONTransformer implements ResponseTransformer {
  private ObjectMapper mapper;

  JSONTransformer() {
      mapper = new ObjectMapper();
  }

  ObjectMapper mapper() { return mapper; }

  @Override
  public String render(Object model) {
      try {
          return mapper.writeValueAsString(model);
      }
      catch (JsonProcessingException e) {
          return "{}";
      }
  }
}
