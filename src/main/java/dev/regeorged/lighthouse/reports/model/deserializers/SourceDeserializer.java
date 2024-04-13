package dev.regeorged.lighthouse.reports.model.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import dev.regeorged.lighthouse.reports.model.generated.Source;

import java.io.IOException;

public class SourceDeserializer extends JsonDeserializer<Source> {

    @Override
    public Source deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        Source source = new Source();

        if (node.isTextual()) {
            source.setValue(node.asText());
        } else {
            if (node.has("type")) {
                source.setType(node.get("type").asText());
            }
            if (node.has("value")) {
                source.setValue(node.get("value").asText());
            }
            if (node.has("network")) {
                source.setNetwork(node.get("network").asText());
            }
        }

        return source;
    }
}
