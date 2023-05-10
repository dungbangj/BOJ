const fs = require('fs');

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLine = input.split('\n');

const squareOne = inputLine[0].split(' ').map(Number);
const squareTwo = inputLine[1].split(' ').map(Number);

const minX = Math.min(squareOne[0], squareTwo[0]);
const maxX = Math.max(squareOne[2], squareTwo[2]);

const minY = Math.min(squareOne[1], squareTwo[1]);
const maxY = Math.max(squareOne[3], squareTwo[3]);

const maxSide = Math.max(maxX - minX, maxY - minY);

console.log(Math.pow(maxSide, 2));