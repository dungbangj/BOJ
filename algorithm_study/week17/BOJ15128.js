const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs = input.split(' ').map(Number);

const result = inputs[0] / inputs[1] * inputs[2] / inputs[3] / 2;

if (result === Math.floor(result)) {
	console.log(1);
} else {
	console.log(0);
}