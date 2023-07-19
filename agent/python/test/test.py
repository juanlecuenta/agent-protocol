from agent_protocol import (
    Agent,
    AgentTaskInput,
    AgentStepInput,
    AgentStepResult,
    Agent,
    AgentStepHandler,
)


async def task_handler(task: AgentTaskInput | None) -> AgentStepHandler:
    print(f"task: {task}")

    async def step_handler(step: AgentStepInput | None):
        print(f"step: {step}")
        # TODO: Handle "final" step - how to indicate the step was the last one?
        return AgentStepResult(
            output="",
            artifacts=[],
        )

    return step_handler


Agent.handle_task(task_handler).start()