my_array = [64, 34, 25, 12, 22, 11, 90, 5]

n = len(my_array)
for i in range(1,n):#starts from 1 since 0 is consider as default sorted part
    insert_index = i
    current_value = my_array.pop(i)
    for j in range(i-1, -1, -1):#reverce loop to compare the vlues of unsorted part to the sorted part in order of right to left of sorted part
        if my_array[j] > current_value:
            insert_index = j
    my_array.insert(insert_index, current_value)

print("Sorted array:", my_array)
