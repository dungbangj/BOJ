const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs = input.split(' ').map(Number);

const N = inputs[0];

const A = inputs[1];
const B = inputs[2];
const C = inputs[3];
const D = inputs[4];

const buyA = Math.ceil(N / A) * B;
const buyB = Math.ceil(N / C) * D;

console.log(Math.min(buyA, buyB));