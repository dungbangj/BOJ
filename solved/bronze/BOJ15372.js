const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n').map(Number);

const T = inputLine[0];

let result = "";
for (let i = 1; i <= T; i++) {
	const oneInput = inputLine[i];
	const squreOne = Math.pow(oneInput, 2);
	result += squreOne + "\n";
}
console.log(result);