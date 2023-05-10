import * as fs from 'fs';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs: number[] = input.split(' ').map(Number);

const max: number = Math.max(inputs[0], inputs[1]);

console.log(max);