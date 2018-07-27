#!/usr/bin/env bash
echo 'docker create myJar!'
CUR_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"


docker create                                               \
    --name first-bootjar                                    \
    --restart unless-stopped                                \
    -p 9001:8080                                            \
    registry.cn-hangzhou.aliyuncs.com/kingsilk/qh-openjdk   \
    -v ${CUR_DIR}:${CUR_DIR}                                \
    ${CUR_DIR}/start.sh                                     \

docker start first-bootjar

