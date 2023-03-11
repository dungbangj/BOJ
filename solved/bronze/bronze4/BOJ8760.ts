import * as fs from 'fs';

const input:  string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const test: number = input.split('\n').slice(0).map(Number)[0];
const testCases: number[][] = input.split("\n").slice(1).map(line => line.split(' ').map(Number));

// console.log(test);
// console.log(input);

for (let [w, k] of testCases) {
    let maxGuests: number = Math.floor((w * k) / 2);
    console.log(maxGuests)
}