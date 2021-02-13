marks = float(250)
total_marks = float(600)

percent = float((marks / total_marks)) * 100

if percent >= 70:
	print("First class with distinction...!")
elif percent >= 60 and percent < 70:
	print("First Class...!")
elif percent >= 50 and percent < 60:
	print("Second Class")
elif percent >= 40 and percent < 50:
	print("Pass...!")
else:
	print("fail...!")
