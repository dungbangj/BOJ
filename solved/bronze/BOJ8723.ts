/* 8713 스틱 */

import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const[a, b, c]: number[] = input.split(' ').map(Number);

let sum = a + b + c;
let min = Math.min(a, b, c);
let max = Math.max(a, b, c);
let mid = sum - max - min;

// console.log(min, max, mid);

if (min == max && max == mid)
    console.log(2);
else if (Math.sqrt(min * min + mid * mid) == max)
    console.log(1);
else
    console.log(0);