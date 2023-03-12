import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const inputs: number[] = input.split(' ').map(Number);

const RCCTV: number = Math.ceil(inputs[0] / inputs[2]);

const CCCTV: number = Math.ceil(inputs[1] / inputs[2]);

const totalCCTV: number = RCCTV * CCCTV;

console.log(totalCCTV);