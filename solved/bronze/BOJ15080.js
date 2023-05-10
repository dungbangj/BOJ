const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n');
const start = inputLine[0].split(' ');
const end = inputLine[1].split(' ');
const startTime = [];
const endTime = [];

for (let i = 0; i < start.length; i++) {
	if (start[i] === ':') {
		continue;
	}
	startTime.push(parseInt(start[i]));
	endTime.push(parseInt(end[i]));
}
let sum = 0;
if (startTime[2] > endTime[2]) {
	endTime[1]--;
	endTime[2] += 60;
}
sum += endTime[2] - startTime[2];
if (startTime[1] > endTime[1]) {
	endTime[0]--;
	endTime[1] += 60;
}
sum += (endTime[1] - startTime[1]) * 60;
if (startTime[0] > endTime[0]) {
	endTime[0] += 24;
}
sum += (endTime[0] - startTime[0]) * 3600;

console.log(sum);