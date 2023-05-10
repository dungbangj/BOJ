const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n').map(Number);

const A = inputLine[0];
const B = inputLine[1];
const C = inputLine[2];
const D = inputLine[3];
const E = inputLine[4];

let time = 0;
if (B > 0) {
	if (A >= 0) {
		time += (B - A) * E;
	} else {
		time += B * E;
	}
}
if (A < 0) {
	time += C * Math.abs(A);
	time += D;
}
console.log(time);