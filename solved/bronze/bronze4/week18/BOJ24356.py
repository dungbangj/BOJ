[t1, m1, t2, m2] = map(int, input().split(' '))

t1 *= 60
t2 *= 60

time1 = t1 + m1
time2 = t2 + m2

time_diff = time2 - time1
if time_diff < 0:
	time2 += 1440
print(str(time2 - time1) + ' ' + str((time2 - time1) // 30))