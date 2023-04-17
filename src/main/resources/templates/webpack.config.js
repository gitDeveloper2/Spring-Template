const path=require('path');
module.exports={
entry:{
    index: path.resolve(__dirname,'./src/index.js')
},
output:{
    path:path.resolve(__dirname,'./build'),
    filename:'[name].bundle.js'
},
module:{
    rules:[
        //   {
        //     test: /\.css$/,
        //     use: ["style-loader", "css-loader"]
        // },
        // 
        // ,
        {
            test: /\.(scss)$/,
        use:[
            {
                loader: 'style-loader'
            },
            {
                loader: 'css-loader'
            },
            
            {
                loader: 'sass-loader'
            }
        ]

    }

    ]
}

,

performance:
        {
            hints:false,
            maxEntrypointSize: 512000,
            maxAssetSize: 512000
        }

}


        
        
    
