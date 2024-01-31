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
import agentprotocol.micronaut.model.Pagination;
import agentprotocol.micronaut.model.Task;
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
 * TaskListResponse
 */
@Serdeable
@JsonPropertyOrder({
    TaskListResponse.JSON_PROPERTY_TASKS,
    TaskListResponse.JSON_PROPERTY_PAGINATION
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class TaskListResponse {

    public static final String JSON_PROPERTY_TASKS = "tasks";
    public static final String JSON_PROPERTY_PAGINATION = "pagination";

    @NotNull
    @Schema(name = "tasks", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TASKS)
    private List<Task> tasks;

    @NotNull
    @Valid
    @Schema(name = "pagination", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGINATION)
    private Pagination pagination;

    public TaskListResponse(List<Task> tasks, Pagination pagination) {
        this.tasks = tasks;
        this.pagination = pagination;
    }

    /**
     * @return the tasks property value
     */
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * Set the tasks property value
     */
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Set tasks in a chainable fashion.
     * @return The same instance of TaskListResponse for chaining.
     */
    public TaskListResponse tasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Add an item to the tasks property in a chainable fashion.
     * @return The same instance of TaskListResponse for chaining.
     */
    public TaskListResponse addTasksItem(Task tasksItem) {
        this.tasks.add(tasksItem);
        return this;
    }

    /**
     * @return the pagination property value
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * Set the pagination property value
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * Set pagination in a chainable fashion.
     * @return The same instance of TaskListResponse for chaining.
     */
    public TaskListResponse pagination(Pagination pagination) {
        this.pagination = pagination;
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
        TaskListResponse taskListResponse = (TaskListResponse) o;
        return Objects.equals(this.tasks, taskListResponse.tasks) &&
            Objects.equals(this.pagination, taskListResponse.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, pagination);
    }

    @Override
    public String toString() {
        return "TaskListResponse("
            + "tasks: " + getTasks() + ", "
            + "pagination: " + getPagination()
            + ")";
    }

}