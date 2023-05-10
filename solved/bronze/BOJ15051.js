const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs = input.split('\n').map(Number);

const caseOne = inputs[1] * 2 + inputs[2] * 4;
const caseTwo = inputs[0] * 2 + inputs[2] * 2;
const caseThree = inputs[0] * 4 + inputs[1] * 2;

const result = Math.min(caseOne, caseThree, caseTwo);

console.log(result);