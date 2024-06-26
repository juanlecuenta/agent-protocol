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
 * Task
 */
@Serdeable
@JsonPropertyOrder({
    Task.JSON_PROPERTY_INPUT,
    Task.JSON_PROPERTY_ADDITIONAL_INPUT,
    Task.JSON_PROPERTY_TASK_ID,
    Task.JSON_PROPERTY_ARTIFACTS
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class Task {

    public static final String JSON_PROPERTY_INPUT = "input";
    public static final String JSON_PROPERTY_ADDITIONAL_INPUT = "additional_input";
    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";

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

    /**
     * The ID of the task.
     */
    @NotNull
    @Schema(name = "task_id", example = "50da533e-3904-4401-8a07-c49adf88b5eb", description = "The ID of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TASK_ID)
    private String taskId;

    /**
     * A list of artifacts that the task has produced.
     */
    @NotNull
    @Schema(name = "artifacts", example = "[\"7a49f31c-f9c6-4346-a22c-e32bc5af4d8e\",\"ab7b4091-2560-4692-a4fe-d831ea3ca7d6\"]", description = "A list of artifacts that the task has produced.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ARTIFACTS)
    private List<Artifact> artifacts;

    public Task(String taskId, List<Artifact> artifacts) {
        this.taskId = taskId;
        this.artifacts = artifacts;
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
     * @return The same instance of Task for chaining.
     */
    public Task input(String input) {
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
     * @return The same instance of Task for chaining.
     */
    public Task additionalInput(Object additionalInput) {
        this.additionalInput = additionalInput;
        return this;
    }

    /**
     * The ID of the task.
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
     * @return The same instance of Task for chaining.
     */
    public Task taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * A list of artifacts that the task has produced.
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
     * @return The same instance of Task for chaining.
     */
    public Task artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Add an item to the artifacts property in a chainable fashion.
     * @return The same instance of Task for chaining.
     */
    public Task addArtifactsItem(Artifact artifactsItem) {
        this.artifacts.add(artifactsItem);
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
        Task task = (Task) o;
        return Objects.equals(this.input, task.input) &&
            Objects.equals(this.additionalInput, task.additionalInput) &&
            Objects.equals(this.taskId, task.taskId) &&
            Objects.equals(this.artifacts, task.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, additionalInput, taskId, artifacts);
    }

    @Override
    public String toString() {
        return "Task("
            + "input: " + getInput() + ", "
            + "additionalInput: " + getAdditionalInput() + ", "
            + "taskId: " + getTaskId() + ", "
            + "artifacts: " + getArtifacts()
            + ")";
    }

}