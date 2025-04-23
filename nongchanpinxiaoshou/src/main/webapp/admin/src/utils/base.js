const base = {
    get() {
        return {
            url : "http://localhost:8080/nongchanpinxiaoshou/",
            name: "nongchanpinxiaoshou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/nongchanpinxiaoshou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "农产品线上销售网站"
        } 
    }
}
export default base
