#!/bin/bash
date
if ! [ -f .git/index ]; then
echo 'Error. Status 1'
fi
COMMIT_COUNT=$(git rev-list --count --all)
echo 'All commits: '"$COMMIT_COUNT"
COMMIT_COUNT=$(git rev-list --count --since="1 week ago" --all)
echo 'Количество коммитов за прошедшую неделю: '"$COMMIT_COUNT"
git log --since "1 week ago" --pretty=tformat: --numstat \
| gawk '{ ADD_COUNT += $1 ; SUBS_COUNT += $2 ;  } END { printf "Добавлено строк за прошедшую неделю: %s\nУдалено строк за прошедшую неделю : %s\n",ADD_COUNT,SUBS_COUNT }'
echo 'Пользователи, внесшие изменения за последнюю неделю:'
git log --since "1 week ago" --format='%an <%ae>' | sort | uniq
