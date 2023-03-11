import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const[x, k]: number[] = input.split(' ').map(Number);

let sum = 0;

let firstCase = k + k * 2 + k * 4;
let secondCase = k / 2 + k + k * 2;
let thirdCase = k / 4 + k / 2 + k;

if (firstCase <= x)
    console.log(firstCase * 1000);
else if (secondCase <= x)
    console.log(secondCase * 1000);
else if (thirdCase <= x)
    console.log(thirdCase * 1000);
else
    console.log(0);