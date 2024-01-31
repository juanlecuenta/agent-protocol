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
import com.fasterxml.jackson.annotation.*;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import io.micronaut.core.annotation.Introspected;
import agentprotocol.micronaut.invoker.annotation.HardNullable;
import jakarta.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Definition of an agent task.
 */
@Schema(name = "Task_allOf", description = "Definition of an agent task.")
@Serdeable
@JsonPropertyOrder({
    TaskAllOf.JSON_PROPERTY_TASK_ID,
    TaskAllOf.JSON_PROPERTY_ARTIFACTS
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class TaskAllOf {

    public static final String JSON_PROPERTY_TASK_ID = "task_id";
    public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";

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

    public TaskAllOf(String taskId, List<Artifact> artifacts) {
        this.taskId = taskId;
        this.artifacts = artifacts;
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
     * @return The same instance of TaskAllOf for chaining.
     */
    public TaskAllOf taskId(String taskId) {
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
     * @return The same instance of TaskAllOf for chaining.
     */
    public TaskAllOf artifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Add an item to the artifacts property in a chainable fashion.
     * @return The same instance of TaskAllOf for chaining.
     */
    public TaskAllOf addArtifactsItem(Artifact artifactsItem) {
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
        TaskAllOf taskAllOf = (TaskAllOf) o;
        return Objects.equals(this.taskId, taskAllOf.taskId) &&
            Objects.equals(this.artifacts, taskAllOf.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, artifacts);
    }

    @Override
    public String toString() {
        return "TaskAllOf("
            + "taskId: " + getTaskId() + ", "
            + "artifacts: " + getArtifacts()
            + ")";
    }

}