import * as fs from 'fs';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs: number[] = input.split(' ').map(Number);

let countZero = 0;
let countOne = 0;
let result: number = 0;

for (let i = 0; i < 3; i++) {
	if (inputs[i] === 1) {
		countOne++;
	}
	if (inputs[i] === 0) {
		countZero++;
	}
}

if (countOne === 3 || countZero === 3) {
	console.log("*");
	process.exit();
} else if (countOne < countZero) {
	result = findLess(1);
} else if (countOne > countZero) {
	result = findLess(0);
}

function findLess(num: number): number {
	for (let i = 0; i < 3; i++) {
		if (inputs[i] === num) {
			return i;
		}
	}
	return 0;
}
console.log(String.fromCharCode('A'.charCodeAt(0) + result));
