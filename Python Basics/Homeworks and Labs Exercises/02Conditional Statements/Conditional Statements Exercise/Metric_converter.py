number = float(input())
input_metric = str(input())
output_metric = str(input())
converted_metric = 0

if input_metric == "m" and output_metric == "cm":
    converted_metric = number * 100
elif input_metric == "m" and output_metric == "mm":
    converted_metric = number * 1000
elif input_metric == "cm" and output_metric == "m":
    converted_metric = number / 100
elif input_metric == "cm" and output_metric == "mm":
    converted_metric = number * 10
elif input_metric == "mm" and output_metric == "cm":
    converted_metric = number / 10
elif input_metric == "mm" and output_metric == "m":
    converted_metric = number / 1000

print (f"{converted_metric:.3f}")




