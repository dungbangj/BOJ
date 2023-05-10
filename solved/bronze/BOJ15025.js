const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs = input.split(' ').map(Number);

const maxInput = 2 * Math.max(inputs[0], inputs[1]);


let result = "";

if (inputs[0] !== inputs[1]) {
	result += "Odd ";
} else {
	result += "Even "
}
result += maxInput;
if (maxInput === 0) {
	console.log("Not a moose");
} else {
	console.log(result);
}