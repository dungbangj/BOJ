import * as fs from 'fs';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const WCount: number = input.split('\n').filter(x => x === "W").length;

if (WCount >= 5) {
	console.log(1);
} else if (WCount >= 3) {
	console.log(2);
} else if (WCount >= 1) {
	console.log(3);
} else {
	console.log(-1);
}