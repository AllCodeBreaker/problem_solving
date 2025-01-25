def subarraySum(arr,target):
        size = len(arr)
        for i in range(size):
            sum = 0
            for start in range(i,size):
                sum += arr[start]
                if sum == target :
                    return [i+1, start+1]
                elif sum > target :
                    break
        return -1

if __name__ == "__main__":
        arr = [1,2,5,6,3,8]
        target = 3
        result = subarraySum(arr, target)
        print("Actual Array : ", arr)
        print("Target :", target)
        if result == -1:
                print(-1)
        else:
                print(result, sep=", ")

