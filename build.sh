#!/bin/bash

mkdir -p build;
sclang -d . composition/writeSynthDefs.sc;
scsynth -N ./build/score.osc _ ./build/output.aiff 44100 AIFF int16
