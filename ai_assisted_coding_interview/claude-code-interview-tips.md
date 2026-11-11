# Tips for AI-Assisted Coding Interviews with Claude Code

Ace an AI-assisted coding interview using Claude Code by shifting your role from a lone coder to an **architect and director**. Interviewers are no longer testing whether you can memorize a sorting algorithm; they are testing how well you plan, delegate, supervise, and explain your workflow.

---

### 1. Master the 5-Step Execution Framework
When working with an autonomous terminal agent like Claude Code, follow a disciplined loop:
* **Read First:** Let Claude inspect the repository or codebase first, but make sure *you* understand the file structure before prompting. Never let the agent touch code you haven't scanned.
* **Plan Upfront ("Slow Down to Speed Up"):** Do not immediately type code. Use Claude’s interactive inquiry tools or prompt it to interview *you* about edge cases and trade-offs before writing a single line.
* **Delegate in Small Chunks:** Break features down into narrow, isolated tasks rather than pasting a massive, vague prompt.
* **Verify Line-by-Line:** Treat Claude Code like an over-eager junior engineer. Check its assumptions, inspect every diff, verify security and permission models, and ensure unit tests actually cover what they claim.
* **Explain Constantly:** In an AI interview, 50% of your grade is communication. Narrate *why* you are directing Claude in a specific direction, how you evaluate its trade-offs, and how you validate the output.

---

### 2. Configure a `CLAUDE.md` Instruction File
If the interview setup allows project configuration (or if you are practicing locally), use a `CLAUDE.md` file in your working directory:
* Write explicit rules for Claude in `CLAUDE.md` (e.g., *"Do not give me direct solutions; challenge my reasoning and ask clarifying questions instead"*).
* Enforce coding standards, naming conventions, and architectural boundaries so Claude doesn't drift off-spec.

---

### 3. High-Value Prompt Patterns
Use targeted prompts instead of open-ended hand-offs during practice and live assessments:
* **The Hint Ladder:** *"Give me a level-1 hint only"* to stay in the productive-struggle zone.
* **The Edge-Case Generator:** *"What inputs would break a naive solution to this?"*
* **The Complexity Check:** *"Here is my approach. Don’t fix it—just tell me its time and space complexity and whether it's optimal."*
* **The Mock Interviewer:** *"Run a 30-minute mock. Give me one medium graph problem, stay in character, and only respond as an interviewer would."*

---

### 4. Avoid Critical Pitfalls
* **Treating Claude Code like a Chatbot:** Remember that Claude Code has local file-system and terminal access—it is an autonomous agent, not just a browser chat window.
* **Losing Track of State:** If Claude makes multiple cascading file edits without your strict oversight, you will quickly lose mental control of the codebase. Keep changes atomic.
* **Trusting Passing Tests Blindly:** When Claude writes a fix and tests pass, immediately ask yourself: *What edge cases did these tests miss?*
* **Ignoring Token/Cost & Permissions:** Be mindful of terminal security prompts, file permissions, and workspace safety models.
