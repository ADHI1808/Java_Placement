# Step 1: Read the lower bound of the range (e.g., 2)
lower = int(input())

# Step 2: Read the upper bound of the range (e.g., 13)
upper = int(input())

# Step 3: Read the digit to count (e.g., 3). We keep it as a string because we will search in string format
digit_to_count = input()

# Step 4: Create a variable to keep track of the total count
count = 0

# Step 5: Loop through each number from lower to upper (inclusive)
for number in range(lower, upper + 1):
    # Convert number to string and count how many times the digit appears
    count += str(number).count(digit_to_count)

# Step 6: Print the final count
print(count)
