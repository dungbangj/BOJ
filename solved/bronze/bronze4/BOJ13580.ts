import * as fs from 'fs';
import { exit } from 'process';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs: number[] = input.split(' ').map(Number);
let result: string = "";
let maxVal = 0;
let maxIdx = 0;
for (let i = 0; i < 3; i++) {
	if (inputs[i] > maxVal) {
		maxVal = inputs[i];
		maxIdx = i;
	}
	for (let j = i + 1; j < 3; j++) {
		if (inputs[i] - inputs[j] === 0) {
			console.log("S");
			process.exit(0);
		}
	}
}
let sum = 0;
for (let i = 0; i < 3; i++) {
	if (i === maxIdx) {
		sum -= maxVal;
	} else {
		sum += inputs[i];
	}
}

if (sum === 0) {
	console.log("S");
} else {
	console.log("N");
}