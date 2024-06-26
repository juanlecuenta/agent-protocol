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
import agentprotocol.micronaut.model.Artifact;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
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
 * StepAllOf
 */
@Serdeable
@JsonPropertyOrder({
    StepAllOf.JSON_PROPERTY_TASK_ID,
    StepAllOf.JSON_PROPERTY_STEP_ID,
    StepAllOf.JSON_PROPERTY_NAME,
    StepAllOf.JSON_PROPERTY_STATUS,
    StepAllOf.JSON_PROPERTY_OUTPUT,
    StepAllOf.JSON_PROPERTY_ADDITIONAL_OUTPUT,
    StepAllOf.JSON_PROPERTY_ARTIFACTS,
    StepAllOf.JSON_PROPERTY_IS_LAST
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class StepAllOf {

    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    public static final String JSON_PROPERTY_STEP_ID = "step_id";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_STATUS = "status";
    public static final String JSON_PROPERTY_OUTPUT = "output";
    public static final String JSON_PROPERTY_ADDITIONAL_OUTPUT = "additional_output";
    public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";
    public static final String JSON_PROPERTY_IS_LAST = "is_last";

    /**
     * The ID of the task this step belongs to.
     */
    @NotNull
    @Schema(name = "task_id", example = "50da533e-3904-4401-8a07-c49adf88b5eb", description = "The ID of the task this step belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    private String taskId;

    /**
     * The ID of the task step.
     */
    @NotNull
    @Schema(name = "step_id", example = "6bb1801a-fd80-45e8-899a-4dd723cc602e", description = "The ID of the task step.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_STEP_ID)
    private String stepId;

    /**
     * The name of the task step.
     */
    @HardNullable
    @Schema(name = "name", example = "Write to file", description = "The name of the task step.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String name;

    /**
     * The status of the task step.
     */
    @NotNull
    @Schema(name = "status", example = "created", description = "The status of the task step.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_STATUS)
    private StatusEnum status;

    /**
     * Output of the task step.
     */
    @HardNullable
    @Schema(name = "output", example = "I am going to use the write_to_file command and write Washington to a file called output.txt <write_to_file('output.txt', 'Washington')", description = "Output of the task step.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private String output;

    /**
     * Output that the task step has produced. Any value is allowed.
     */
    @HardNullable
    @Schema(name = "additional_output", example = "{ \"tokens\": 7894, \"estimated_cost\": \"0,24$\" }", description = "Output that the task step has produced. Any value is allowed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_OUTPUT)
    @JsonInclude(JsonInclude.Include.USE_DEFAULTS)
    private Object additionalOutput;

    /**
     * A list of artifacts that the step has produced.
     */
    @NotNull
    @Schema(name = "artifacts", description = "A list of artifacts that the step has produced.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ARTIFACTS)
    private List<Artifact> artifacts;

    /**
     * Whether this is the last step in the task.
     */
    @NotNull
    @Schema(name = "is_last", example = "true", description = "Whether this is the last step in the task.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_IS_LAST)
    private Boolean isLast = false;

    public StepAllOf(String taskId, String stepId, StatusEnum status, List<Artifact> artifacts, Boolean isLast) {
        this.taskId = taskId;
        this.stepId = stepId;
        this.status = status;
        this.artifacts = artifacts;
        this.isLast = isLast;
    }

    /**
     * The ID of the task this step belongs to.
     * @return the taskId property value
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Set the taskId property value
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * Set taskId in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * The ID of the task step.
     * @return the stepId property value
     */
    public String getStepId() {
        return stepId;
    }

    /**
     * Set the stepId property value
     */
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * Set stepId in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf stepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * The name of the task step.
     * @return the name property value
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name property value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set name in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The status of the task step.
     * @return the status property value
     */
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Set the status property value
     */
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Set status in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Output of the task step.
     * @return the output property value
     */
    public String getOutput() {
        return output;
    }

    /**
     * Set the output property value
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * Set output in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf output(String output) {
        this.output = output;
        return this;
    }

    /**
     * Output that the task step has produced. Any value is allowed.
     * @return the additionalOutput property value
     */
    public Object getAdditionalOutput() {
        return additionalOutput;
    }

    /**
     * Set the additionalOutput property value
     */
    public void setAdditionalOutput(Object additionalOutput) {
        this.additionalOutput = additionalOutput;
    }

    /**
     * Set additionalOutput in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf additionalOutput(Object additionalOutput) {
        this.additionalOutput = additionalOutput;
        return this;
    }

    /**
     * A list of artifacts that the step has produced.
     * @return the artifacts property value
     */
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    /**
     * Set the artifacts property value
     */
    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * Set artifacts in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Add an item to the artifacts property in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf addArtifactsItem(Artifact artifactsItem) {
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
     * Whether this is the last step in the task.
     * @return the isLast property value
     */
    public Boolean getIsLast() {
        return isLast;
    }

    /**
     * Set the isLast property value
     */
    public void setIsLast(Boolean isLast) {
        this.isLast = isLast;
    }

    /**
     * Set isLast in a chainable fashion.
     * @return The same instance of StepAllOf for chaining.
     */
    public StepAllOf isLast(Boolean isLast) {
        this.isLast = isLast;
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
        StepAllOf stepAllOf = (StepAllOf) o;
        return Objects.equals(this.taskId, stepAllOf.taskId) &&
            Objects.equals(this.stepId, stepAllOf.stepId) &&
            Objects.equals(this.name, stepAllOf.name) &&
            Objects.equals(this.status, stepAllOf.status) &&
            Objects.equals(this.output, stepAllOf.output) &&
            Objects.equals(this.additionalOutput, stepAllOf.additionalOutput) &&
            Objects.equals(this.artifacts, stepAllOf.artifacts) &&
            Objects.equals(this.isLast, stepAllOf.isLast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, stepId, name, status, output, additionalOutput, artifacts, isLast);
    }

    @Override
    public String toString() {
        return "StepAllOf("
            + "taskId: " + getTaskId() + ", "
            + "stepId: " + getStepId() + ", "
            + "name: " + getName() + ", "
            + "status: " + getStatus() + ", "
            + "output: " + getOutput() + ", "
            + "additionalOutput: " + getAdditionalOutput() + ", "
            + "artifacts: " + getArtifacts() + ", "
            + "isLast: " + getIsLast()
            + ")";
    }

    /**
     * The status of the task step.
     */
    @Serdeable
    public enum StatusEnum {
        CREATED("created"),
        RUNNING("running"),
        COMPLETED("completed");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        /**
         * @return The value represented by this enum
         */
        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        private final static Map<String, StatusEnum> VALUE_MAPPING = Arrays.stream(values())
            .collect(Collectors.toMap(v -> v.getValue(), v -> v));

        /**
         * Create this enum from a value.
         * @return The enum.
         */
        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (!VALUE_MAPPING.containsKey(value)) {
                throw new IllegalArgumentException("Unexpected value '" + value + "'");
            }
            return VALUE_MAPPING.get(value);
        }
    }}