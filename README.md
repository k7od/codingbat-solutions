# CodingBat Solutions

This repository contains my solutions to CodingBat Java problems.  
Each problem is solved in its own feature branch following a consistent Git workflow.

## How to Use

1. **Solve problems on [CodingBat](https://codingbat.com) website.**  
2. **Copy the working solution code locally.**  
3. **Create a new Git branch for each problem using the format:**  
   `category-problemName`  
   e.g. `warmup1-sleepIn`  
4. **Save the solution inside the corresponding folder** (e.g., `warmup1/SleepIn.java`).  
5. **Commit with a clear message:**  
   `"Add solution for warmup1-sleepIn"`  
6. **Push the branch and create a Pull Request (PR) to merge into main.**

## Git Workflow

```bash
git checkout -b warmup1-sleepIn
mkdir -p warmup1
# Add your solution file warmup1/SleepIn.java
git add .
git commit -m "Add solution for warmup1-sleepIn"
git push origin warmup1-sleepIn

