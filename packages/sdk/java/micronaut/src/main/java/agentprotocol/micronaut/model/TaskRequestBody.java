/*
 * Agent Protocol
 * Specification of the API protocol for communication with an agent.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package agentprotocol.micronaut.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Introspected;
import agentprotocol.micronaut.invoker.annotation.HardNullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Body of the task request.
 */
@Schema(name = "TaskRequestBody", description = "Body of the task request.")
@Serdeable
@JsonPropertyOrder({
    TaskRequestBody.JSON_PROPERTY_INPUT,
    TaskRequestBody.JSON_PROPERTY_ADDITIONAL_INPUT
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class TaskRequestBody {

    public static final String JSON_PROPERTY_INPUT = "input";
    public static final String JSON_PROPERTY_ADDITIONAL_INPUT = "additional_input";

    /**
     * Input prompt for the task.
     */
    @HardNullable
    @Schema(name = "input", example = "Write 'Washington' to the file 'output.txt'.", description = "Input prompt for the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String input;

    /**
     * Input parameters for the task. Any value is allowed.
     */
    @HardNullable
    @Schema(name = "additional_input", example = "{ \"debug\": false, \"mode\": \"benchmarks\" }", description = "Input parameters for the task. Any value is allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INPUT)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Object additionalInput;

    public TaskRequestBody() {
    }

    /**
     * Input prompt for the task.
     * @return the input property value
     */
    public String getInput() {
        return input;
    }

    /**
     * Set the input property value
     */
    public void setInput(String input) {
        this.input = input;
    }

    /**
     * Set input in a chainable fashion.
     * @return The same instance of TaskRequestBody for chaining.
     */
    public TaskRequestBody input(String input) {
        this.input = input;
        return this;
    }

    /**
     * Input parameters for the task. Any value is allowed.
     * @return the additionalInput property value
     */
    public Object getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Set the additionalInput property value
     */
    public void setAdditionalInput(Object additionalInput) {
        this.additionalInput = additionalInput;
    }

    /**
     * Set additionalInput in a chainable fashion.
     * @return The same instance of TaskRequestBody for chaining.
     */
    public TaskRequestBody additionalInput(Object additionalInput) {
        this.additionalInput = additionalInput;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskRequestBody taskRequestBody = (TaskRequestBody) o;
        return Objects.equals(this.input, taskRequestBody.input) &&
            Objects.equals(this.additionalInput, taskRequestBody.additionalInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, additionalInput);
    }

    @Override
    public String toString() {
        return "TaskRequestBody("
            + "input: " + getInput() + ", "
            + "additionalInput: " + getAdditionalInput()
            + ")";
    }

}