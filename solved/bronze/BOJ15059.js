const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n');
const food = inputLine[0].split(' ').map(Number);
const request = inputLine[1].split(' ').map(Number);

let sum = 0;
for (let i = 0; i < 3; i++) {
	if (food[i] < request[i]) {
		sum += request[i] - food[i];
	}
}
console.log(sum);