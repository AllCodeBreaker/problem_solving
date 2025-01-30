def missingNumber(arr):
	n = len(arr) +1;
	expectedSum = int(n * (n+1) / 2)
	mySum = 0
	for number in arr:
		mySum += number
	return expectedSum - mySum

if __name__ == "__main__":
	arr = [1,2,3,4,5,7,8]
	print("Actual Array: ", arr)
	print(f"Missing In Array: {missingNumber(arr)}")
