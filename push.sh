#!/usr/bin/env bash
set -e

# 0) 윈도우 줄바꿈 이슈 방지(선택)
# git config core.autocrlf false >/dev/null 2>&1 || true

# 1) 최신 원격 반영
git fetch origin main
git pull --rebase origin main

# 2) 변경 커밋 후 푸시
git add -A
git commit -m "auto: $(date '+%Y-%m-%d %H:%M:%S')" || echo "nothing to commit"
git push origin main
