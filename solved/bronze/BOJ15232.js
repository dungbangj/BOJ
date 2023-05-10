const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n').map(Number);

const R = inputLine[0];
const C = inputLine[1];

let result = "";
for (let i = 0; i < R; i++) {
	for (let j = 0; j < C; j++) {
		result += "*";
	}
	result += '\n';
}
console.log(result);