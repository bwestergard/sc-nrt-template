#!/bin/bash

export SC_SYNTHDEF_PATH=./build;

mkdir -p build;
rm build/*;
sclang -d . composition/writeSynthDefs.sc;
node composition/generateScore.js;
scsynth -N ./build/javascriptScore.osc _ ./build/output.aiff 44100 AIFF int16
