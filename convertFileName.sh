#!/bin/sh

awk '{
    print toupper(substr($0, 0, 1)) substr($0, 2) "Kt"
}' <<< $@ | sed -E 's/^([0-9])/_\1/'